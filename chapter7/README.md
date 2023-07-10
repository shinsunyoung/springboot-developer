# 07장. 블로그 화면 구성하기
# Q&A 
- createdAt, updatedAt이 제대로 생성되지 않는다.
  - 해결: 엔티티 최상단에 @EntityListeners(AuditingEntityListener.class)를 추가한다.
