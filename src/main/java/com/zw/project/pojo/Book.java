package com.zw.project.pojo;

import java.io.Serializable;

/**
 * @Description: <br>
 *               网站：<a href="http://www.fkit.org">疯狂Java</a>
 * @author 肖文吉 36750064@qq.com
 * @version V1.0
 */
public class Book implements Serializable {

	private Integer id;
	private String name;
	private String author;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(Integer id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + "]";
	}

}
