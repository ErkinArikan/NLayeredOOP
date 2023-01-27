package dataAcces;

import Entities.Category;
import Entities.Course;
import Entities.Instructor;

public class HibernateProductDao implements ProductDao{
    public void add(Course course){

        System.out.println(course.getName() + " Course added by Hibernate");
    }

    @Override
    public void add(Instructor instructor) {
        System.out.println(instructor.getInstructorName() + " Instructor added by Hibernate");
    }

    @Override
    public void add(Category category) {
        System.out.println(category.getName() + " Category added by Hibernate");
    }
}
