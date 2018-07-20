package kh.spring.dto;

public class BuebeDTO {
	private int seq;
	private String writer;
	private String title;
	private String contents;
	private String writedate;
	private String password;
		
	public BuebeDTO() {
		super();
	}

	public BuebeDTO(int seq, String writer, String title, String contents, String writedate, String password) {
		super();
		this.seq = seq;
		this.writer = writer;
		this.title = title;
		this.contents = contents;
		this.writedate = writedate;
		this.password = password;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getWritedate() {
		return writedate;
	}

	public void setWritedate(String writedate) {
		this.writedate = writedate;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	
}
