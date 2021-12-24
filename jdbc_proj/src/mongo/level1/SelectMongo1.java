package mongo.level1;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.bson.Document;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

public class SelectMongo1 {

	public static void main(String[] args) {
		
		Logger mongoLogger = Logger.getLogger("org.mongodb.driver");
		mongoLogger.setLevel(Level.SEVERE);
		try {
			MongoClient mongoClient = new MongoClient("localhost", 27017);
			 MongoDatabase db = mongoClient.getDatabase("edudb");
			 MongoCollection<Document> collection = db.getCollection("book");
			 MongoCursor<Document> cursor = collection.find().iterator();
			 while(cursor.hasNext()) {
			 System.out.println(cursor.next());
			 }
		} catch (Exception exception) {
			System.out.println(exception.getClass().getName() + ": " + exception.getMessage());
		}

	}

}
