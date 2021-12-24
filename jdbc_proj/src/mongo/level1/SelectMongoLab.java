package mongo.level1;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

public class SelectMongoLab {

	public static void main(String[] args) {
		Logger mongoLogger = Logger.getLogger("org.mongodb.driver");
		mongoLogger.setLevel(Level.SEVERE);
		try {
			MongoClient mongoClient = new MongoClient("localhost", 27017);
			MongoDatabase db = mongoClient.getDatabase("kkka");
			MongoCollection<Document> collection = db.getCollection("kkka");
			MongoCursor<Document> cursor = collection.find().iterator();
		
			while(cursor.hasNext()) {
				
				Document doc = cursor.next();
				System.out.println(doc.get("name") + "팀원의 나이는 " + ((Double)doc.get("age")).intValue() + "입니다.");
				System.out.println("[좋아하는 책 리스트]");
				
				List<Document> books = (List<Document>)doc.get("book");
				for(Document book : books) {
					System.out.println("책 제목 : " + book.get("booknm"));
					System.out.println("출판사 : " + book.get("bookpub"));
					System.out.println("장르 : " + book.get("bookkind"));
				
			}
				System.out.println("--------------------------------");
		        mongoClient.close();
		    }
		}catch(Exception exception){
		System.err.println(exception.getClass().getName() + ": " + exception.getMessage());
	}

}

}
