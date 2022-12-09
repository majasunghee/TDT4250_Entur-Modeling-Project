# TDT4250-Assignment 2

## Description of task 
The goal of assignment 2 is to get experience with transformations using model to text (M2T) transformation or model to model (M2M) transformation. The task is to implement a transformation from (an instance of) the model from assignment 1 to a web page corresponding to those we have modelled. In our case, we have implemented a transformation from a model of the study programme Master of Science in Informatics (MSIT). 

The web page generated in the runtime-EclipseApplication repository is set up to show the study plan for each specialization in the study programme. A different study plan will be shown depending on which specialization you choose to filter on. Upon choosing a specialization you will be able to see a list of mandatory and elective courses the student can sign up for each semester.

## Repo Structure of Assignment_2
This repo shows new packages/files that have been added from the repository in Assignment 1. 

:file_folder: tdt4250.study_programme.model2  <br/>
&nbsp; :file_folder: model  <br/>
&nbsp; :file_folder: src  <br/>
&nbsp; &nbsp; :file_folder: example  <br/>
&nbsp; &nbsp; &nbsp;  :page_facing_up: Transformation.xtend  <br/>
&nbsp; &nbsp; :file_folder: impl  <br/>
&nbsp; &nbsp; :file_folder: transformed  <br/>
&nbsp; &nbsp; &nbsp;  :page_facing_up: NTNU-change-course.xmi  <br/>
&nbsp; &nbsp; &nbsp;  :page_facing_up: NTNU-new-course.xmi  <br/>
&nbsp; &nbsp; &nbsp;  :page_facing_up: NTNU-show-select-group-course.xmi  <br/>
&nbsp; &nbsp; :file_folder: util  <br/>
&nbsp; :file_folder: xtend-gen  <br/>
&nbsp; &nbsp; :file_folder: tdt4250.study_programme.example  <br/>
&nbsp; &nbsp; &nbsp;  :page_facing_up: Transformation.java  <br/>



Transformation.xtend contains code for transforming the NTNU model. The model can be transformed in three different ways:
- You can create new courses. The result of this transformation is shown in NTNU-new-course.xmi.
- You can change the exam type of a course. The result of this transformation is shown in NTNU-change-course.xmi.
- You can view a list of all elective courses available for the specialization of a study programme. The result of this transformation is shown in NTNU-show-select-group-course.xmi.

## How to run
You can change the input of createCourse, changeExamTypeInCourse and showAllElectiveCourses in Transformed.xtend to make desired changes to the model. Then you can run the xtend file as a java application to generate transformed models. 


## Changes to the model from Assignment 1
The model in Assignment 2 does not contain any major changes from the model in Assignment 1. The changes are based on the feedback provided by the lecturer for assignment 1, most of which were regarding the multiplicity of attributes and relations. A complete list of all changes made is provided below.

- We previously had a class named NTNU which has been renamed to University, as it is not an instance of a specific university.
- Removed reference to Specialization from Semester.
- Removed reference to courses in Semester since a course must be associated to a mandatory or elective group which are groups that exist for Semester.
- Removed name attribute in GroupedCourses
- Changed examType so it is an enum with three possible values: written exam, project, and oral exam.
- Added a new enum called Season with two possible values: Høst and Vår. Also added a year attribute in Semester, and a type attribute that ponts to the Season enum. Year and Season are used to identify a Semester (instead of a name attribute).
- Checked and fixed the multiplicity of attributes and relations.
    -  In University class:
        -   Lower bound of programmes and courses was changed from 0 to 1.
    -  In StudyProgramme class:
        -   Lower and upper bound of name was changed from (0,-1) to (1,2); a study programme can have a Norwegian or an English name.
        -   Upper bound of specializations was changed from -1 to 4 since most Master degrees have up to four possible specializations.
        -   Upper bound of semesters was changed from -1 to 10. Here we assume the maximum amount of semesters is the length of a 5-year integrated Master degree.
    -  In Specialization class:
        -   Lower and upper bound of name was changed from (0,1) to (1,2); one for the Norwegian title and one for the English title.
        -   Lower and upper bound of semesters was changed from (1,6) to (4,6). If it is a 2-year Masters degree, the programme/specialization only contains 4 semesters. If a student enrolls in a 5-year integrated Master degree, they often choose specialization after their second year. In this case, the specialization contains 6 semesters.
    -  In Semester class:
        -   Lower and upper bound of groupedCourses was changed from (0,-1) to (1,2); A semester contains at least a grouping of mandatory or elective courses.
    -  In Course class:
        -   Upper bound of name was changed from -1 to 2; One for the Norwegian title and one for the English title.
        -   Lower bound of credits was changed from 0 to 1; A course can only have one number representing the credits. All courses must show credits, even if the course provides 0 credits).
        -   Changed name of courseID to fullCourseName. The upper bound of fullCourseName was changed from 1 to 2; You can have course code + Norwegian name or course code + English name. 
    -  In GroupedCourses:
        -   Lower bound of courses was changed from 0 to 1; If a groupedcourse exists, it must contain at least one course.



**Addressing other questions provided in the feedback**
- Semester is contained in both StudyProgramme and Specialization. We chose to model it like this because a study programme may contain a specialization if it is a 5-year study programme or a 2-year master programme. However, if the study programme is a 3-year Bachelor programme, they seldom contain specializations. Specializations contain semesters with differnt mandatory and elective courses depending on the specialization that has been chosen.
- We changed the name of courseID to fullCourseName to be more clear. fullCourseName is derived from the course code and course name. 


## Authors
Maja Sung Hee Jenssen and Phajsi Halvorsen

