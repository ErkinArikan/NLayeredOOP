package dataAcces;

import Entities.Category;
import Entities.Course;
import Entities.Instructor;

public interface ProductDao {

    //I prefer to use function overloading in here. They have different parameter but have same name.

    //add for course.
    public void add(Course course);

    //add for Instructor.
    public void add(Instructor instructor);

    //add for category.
    public void add(Category category);
}
