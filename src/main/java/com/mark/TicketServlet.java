//package com.mark;
//
//import sun.security.krb5.internal.Ticket;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.MultipartConfig;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.util.LinkedHashMap;
//import java.util.Map;
//
//@WebServlet(
//        name = "ticketServlet",
//        urlPatterns = {"/tickets"},
//        loadOnStartup = 1
//)
//
//// 提供文件上传支持
//@MultipartConfig(
//        fileSizeThreshold = 5_242_880,  // 5MB
//        maxFileSize = 20_971_520L, // 20MB
//        maxRequestSize = 41_943_040L  // 40MB
//)
//
//public class TicketServlet extends HttpServlet {
//    private volatile int TICKET_ID_SEQUEUECE = 1;
//    private Map<Integer, Ticket> ticketDatabase = new LinkedHashMap<>();
//
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//        throws ServletException, IOException {
//        String action = request.getParameter("action");
//        if (action == null)
//            action = "list";
//        switch (action) {
//            case "create":
//                this.showTicketForm(response);
//                break;
//            case "view":
//                this.viewTicket(request, response);
//                break;
//            case "download":
//                this.downloadAttachment(request, response);
//                break;
////            case "download":
//            default:
//                this.listTicket(response);
//                break;
//        }
//    }
//}
