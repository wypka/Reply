package com.lecture.iot.service.array;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.lecture.iot.model.Member;
import com.lecture.iot.service.MemberService;

@Service
public class MemberArrayListService implements MemberService {
	static List<Member> list = new ArrayList();
	static{
		list.add(new Member("dong1","È«±æµ¿1","1234","dong1@naver.com",new Date()));
		list.add(new Member("dong2","È«±æµ¿2","1234","dong2@naver.com",new Date()));
		list.add(new Member("dong3","È«±æµ¿3","1234","dong3@naver.com",new Date()));
		list.add(new Member("dong4","È«±æµ¿4","1234","dong4@naver.com",new Date()));
		list.add(new Member("dong5","È«±æµ¿5","1234","dong5@naver.com",new Date()));
	}
	
	//¸ñ°´Ã¼ 
	
	/* (non-Javadoc)
	 * @see com.lecture.iot.service.MemberService#getList()
	 */
	@Override
	public List<Member> getList(){
		return list;
	}
	/* (non-Javadoc)
	 * @see com.lecture.iot.service.MemberService#getMember(java.lang.String)
	 */
	@Override
	public Member getMember(String userId){
		int index = getIndex(userId);
		Member member = null;
		if(index != -1){
			member = list.get(getIndex(userId));
		}
		return member;
	}
	/* (non-Javadoc)
	 * @see com.lecture.iot.service.MemberService#insert(com.lecture.iot.model.Member)
	 */
	@Override
	public boolean insert(Member member){
		list.add(member);
		return true;
	}
	/* (non-Javadoc)
	 * @see com.lecture.iot.service.MemberService#update(com.lecture.iot.model.Member)
	 */
	@Override
	public boolean update(Member member){//¼öÁ¤		
		int index =getIndex(member.getUserId());
		if(index != -1){
			Member member2 = list.get(index);		
			member2.setDate(new Date());
			member2.setEmail(member.getEmail());
			member2.setName(member.getName());
			member2.setPassword(member.getPassword());
			
			return true;
		}else {
			return false;
		}
		
	}
	/* (non-Javadoc)
	 * @see com.lecture.iot.service.MemberService#delete(java.lang.String)
	 */
	@Override
	public boolean delete(String userId){
		if(getIndex(userId) != -1){
			list.remove(getIndex(userId));
			return true;
		}else {
			return false;
		}			
	}
	private int getIndex(String userId){
		for(int i=0; i<list.size();i++){
			if(list.get(i).getUserId().equals(userId)){
				return i;
			}
		}
		return -1;
	}
	@Override
	public int getCount() {		
		return list.size();
	}
	
}
