package java_board;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class MemberDao {
	private ArrayList<Member> members;
	private int no = 1;

	public MemberDao() {
		members = new ArrayList<>();
//		Article a1 = new Article(1, "안녕하세요", "내용1", "익명", getCurrentDate());
//		Article a2 = new Article(2, "반갑습니다.", "내용2", "익명", getCurrentDate());
//		Article a3 = new Article(3, "안녕", "내용3", "익명", getCurrentDate());
//
//		articles.add(a1);
//		articles.add(a2);
//		articles.add(a3);
	}

	public void insertMember(Member m) {
		m.setId(no);
		no++;
		m.setRegDate(getCurrentDate());

		members.add(m);
	}
	
	private static String getCurrentDate() {
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy.MM.dd");
		Date time = new Date();
		String time1 = format1.format(time);

		return time1;
	}
	
	public ArrayList<Reply> getReplies() {
		return replies;
	}

	public ArrayList<Reply> getRepliesByParentId(int parentId) {
		ArrayList<Reply> searchedReplies = new ArrayList<>();
		for (int i = 0; i < replies.size(); i++) {
			Reply reply = replies.get(i);
			if (reply.getParentId() == parentId) {
				searchedReplies.add(reply);
			}
		}
		return searchedReplies;
	} 
}
