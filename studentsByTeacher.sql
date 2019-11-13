SELECT c.name as teacher, t.id,t.age, t.name,t.sex from student t
inner join student_subjects st on st.student_id=t.id
inner join subject b on b.id=st.subject_id
inner join teacher c on b.teacher=c.id
group by t.id, c.name
order by c.name ASC
