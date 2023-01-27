package Business;

import Core.Logger;
import Entities.Course;
import dataAcces.ProductDao;

import java.util.List;

public class CourseManager {

    //Class members
    ProductDao productDao;
    Logger[] loggers; //Loggers array
    List<Course> courses; // Course List
    Boolean iseEqual=true;// Flag 1
    Boolean isGreater=true;// Flag2

    // I have to fill the array before initialize. Because first one automatically added.
    Course coursee = new Course("Erko","Soft",30);


    //Constructor
    public CourseManager(ProductDao productDao, List<Course> courses,Logger[] loggers) {
        this.productDao = productDao;
        this.courses = courses;
        this.loggers= loggers;
        courses.add(coursee);
    }



    public void add(Course course){


        for(Course course1:courses){// Foreach. course1 object will search the courses list.
            if(course1.getName().equals(course.getName())){ // If the course names are equal make false.


                iseEqual=false;//flag turns to false

            }

            else if (course.getPrice()<=0){// If price lower or equal to zero make false.

                isGreater=false;//flag turns false
            }




            }
        if(iseEqual && isGreater ){// If the flags that we have true take this if statement.

            productDao.add(course);// call add function. For JDBD or Hibernate

            courses.add(course);// adding course to List.

            for (Logger logger: loggers){          // Loggers
                logger.addLogger(course.getName());
            }

        }

        else if(iseEqual==false){//name flag is false
            System.out.println("Course names should be different !!!!");

            iseEqual=true;

        }
        else if(isGreater==false){ // price flag is false
            System.out.println("Course price can not be lower and equals to zero");
            isGreater=true;
        }






    }
}
