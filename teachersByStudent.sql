SELECT d.name as student, t.dni, t.name from teacher t
inner join subject s on s.teacher=t.id
inner join student_subjects st on st.subject_id=s.id
inner join student d on st.student_id=d.id
group by d.name,t.dni,t.name