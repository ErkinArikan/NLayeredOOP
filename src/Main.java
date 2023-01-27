import Business.CategoryManager;
import Business.CourseManager;
import Business.InstructorManager;
import Core.DatabaseLogger;
import Core.FileLogger;
import Core.Logger;
import Core.MailLogger;
import Entities.Category;
import Entities.Course;
import Entities.Instructor;
import dataAcces.HibernateProductDao;
import dataAcces.jdbcProductDao;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        // Course objects I have given same names.
        Course course1= new Course("Java Education Kit","Software",-4);
        Course course2= new Course("Java Education Kit","Software",33);
        Course course3= new Course("Java Education Kit","Software",-3);

        //Course list
        List<Course> courses= new ArrayList<>();

        //Logger list
        Logger[] loggers = {new DatabaseLogger(),new FileLogger()};

        //Course Manager object
        CourseManager courseManager= new CourseManager(new HibernateProductDao(),courses,loggers);

        // I have merged course objects and courseManagementObjects.
        courseManager.add(course1);
        courseManager.add(course2);
        courseManager.add(course3);

        //Category objects. I have given same name.
        Category category= new Category("Software");
        Category category1= new Category("Software");


        //Category list
        List<Category> categories= new ArrayList<>();


        // Category Manager object
        CategoryManager categoryManager= new CategoryManager(new jdbcProductDao(),categories);


        categoryManager.addCategory(category);
        categoryManager.addCategory(category1);



        //Instructor objects.
        Instructor instructor= new Instructor("Sadi Evren Şeker");
        Instructor instructor1= new Instructor("Engin Demiroğ");

        InstructorManager instructorManager= new InstructorManager(new HibernateProductDao());

        instructorManager.addInstructor(instructor);
        instructorManager.addInstructor(instructor1);


    }
}