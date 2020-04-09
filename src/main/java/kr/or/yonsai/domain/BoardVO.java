/**
 * 
 */
package kr.or.yonsai.domain;

import java.util.Date;

import lombok.Data;

/**
 * @author YONSAI
 *
 */
@Data
public class BoardVO {

	private int bno;
	private String title;
	private String content;
	private String writer;
	private Date regdate;
	private Date updatedate;

}
