package com.kh.mybatis.member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.mybatis.member.model.vo.Member;
import com.kh.mybatis.member.service.MemberService;
import com.kh.mybatis.member.service.MemberServiceImpl;

/**
 * Servlet implementation class MemberEnrollCheckId
 */
@WebServlet("/idCheck")
public class MemberEnrollCheckId extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberEnrollCheckId() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("USTF-8");	// 데이터 추출 전 인코딩 처리!!
		
		// 전달받은 아이디 데이터 추출
		String checkId = request.getParameter("userId");
		
		MemberService mService = new MemberServiceImpl();
		Member checkedId = mService.countMemberByUserId(checkId);
		
		if (checkedId == null) {
			
		} else {
			
		}
		
	}

}
