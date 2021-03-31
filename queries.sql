## Part 1: Test it with SQL

SELECT column_name, data_type
FROM information_schema.columns
WHERE table_schema = "tech_jobs"
AND table_name = "job"
;


## Part 2: Test it with SQL

SELECT *
FROM tech_jobs.employer
WHERE location LIKE 'sai%'
;


## Part 3: Test it with SQL

DROP TABLE job;

## Part 4: Test it with SQL


SELECT skill.name, skill.skill_description
FROM skill
LEFT JOIN job_skills
ON skill.id = job_skills.skills_id
WHERE job_skills.jobs_id IS NOT NULL
ORDER BY skill.name ASC
;

