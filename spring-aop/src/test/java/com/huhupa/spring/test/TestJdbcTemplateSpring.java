package com.huhupa.spring.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring.xml")
public class TestJdbcTemplateSpring {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Test
	public void test() {
		jdbcTemplate.update("insert into unit values(null, ?, ?)","µ¥Î»1", 1);
	}
}
