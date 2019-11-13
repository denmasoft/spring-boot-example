SELECT t.dni, t.name, d.name as student from teacher t
inner join subject s on s.teacher=t.id
inner join student_subjects st on st.subject_id=s.id
inner join student d on st.student_id=d.id
group by t.dni,t.name,d.name