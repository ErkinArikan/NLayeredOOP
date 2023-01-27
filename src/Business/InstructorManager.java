package Business;

import Entities.Instructor;
import dataAcces.ProductDao;

public class InstructorManager {
    //Class members
    ProductDao productDao;

    //Constructor
    public InstructorManager(ProductDao productDao) {
        this.productDao = productDao;
    }

    //Instructor adding
    public void addInstructor(Instructor instructor){
        productDao.add(instructor);

    }
}
