package filter;

import java.io.IOException;

import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class HangulFilter
 */
@WebFilter(dispatcherTypes = {DispatcherType.REQUEST }
					, urlPatterns = { "/*" })
public class HangulFilter implements Filter {

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// interface가 갖고있는 추상메서드 꼭 구현해야하므로 할일 없지만 내둬야함
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	
		System.out.println("한글필터 실행");
		if(((HttpServletRequest)request).getMethod().equals("POST")){
			request.setCharacterEncoding("utf-8");
		}
		// pass the request along the filter chain
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// interface가 갖고있는 추상메서드 꼭 구현해야하므로 할일 없지만 내둬야함
	}

}
