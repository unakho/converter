package org.za.conversions.filter;

import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CORSFilter extends OncePerRequestFilter {

    @Override
    public void doFilterInternal(HttpServletRequest request,
                                 HttpServletResponse response, FilterChain filterChain)
            throws IOException, ServletException {

        response.addHeader("Access-Control-Allow-Origin", "*");
        response.addHeader("Access-Control-Allow-Methods", "GET, POST, PUT," +
                "DELETE");
        response.addHeader("Access-Control-Allow-Headers", "Content-Type");
        response.addHeader("Access-Control-Max-Age", "1");

        filterChain.doFilter(request, response);
    }
}
