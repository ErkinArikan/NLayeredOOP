package dataAcces;

import Entities.Category;
import Entities.Course;
import Entities.Instructor;

public class jdbcProductDao implements ProductDao{
    public void add(Course Product){
        System.out.println(Product.getName()+ " Course added by JDBC"); }

    @Override
    public void add(Instructor instructor) {
        System.out.println(instructor.getInstructorName() + " Instructor added by JDBC");
    }

    @Override
    public void add(Category category) {
        System.out.println(category.getName() + " Category added by JDBC");
    }
}
