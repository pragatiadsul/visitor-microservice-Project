package com.visitor.vmsvisitorservice.servicetest;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.visitor.vmsvisitorservice.dto.VisitorDto;
import com.visitor.vmsvisitorservice.model.Visitor;
import com.visitor.vmsvisitorservice.service.VisitorServiceImpl;

@SpringBootTest
@RunWith(SpringRunner.class)
class VisitorServiceTestCase {
	
	@Autowired
	private VisitorServiceImpl visitorService;


	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testVisitorsList() {
		Visitor visitor = new Visitor();
		visitor.setName("reshma");
		List<Visitor> member = visitorService.visitorsList();
		Visitor newMember = member.get(0);
		Assert.assertEquals(visitor.getName(), newMember.getName());
		
	}
	
	@Test
	void testGetByVisitorId() {
		Visitor visitor = visitorService.getByVisitorId(02);
		Assert.assertEquals("pragati", visitor.getName());
		Assert.assertEquals("p@gmail.com", visitor.getEmail());
		
	}
	
	
	@Test
	public void testSaveCategory()
	{
		VisitorDto v1=new VisitorDto();
		v1.setName("priya");
		v1.setAddress("akurdi,pune");
		//v1.setCity("pune");
		v1.setContactPersonEmail("Hr@gmail.com");
		v1.setContactPersonName("kishori");
		v1.setMobileNo("9658253641");
		//v1.setCountry("india");
		v1.setEmail("priya@gmail.com");
		v1.setIdProof("5248DSW129");
		v1.setReasonForVisit("joining");
		v1.setContactPersonMobileNo("8798898974");
		visitorService.addVisitor(v1);
	}
	
	@Test
	public void testGetVisitorByName()
	{	
		Visitor cat=visitorService.getVisitorByName("pragati");
		assertEquals("pragati",cat.getName());
	}
}
