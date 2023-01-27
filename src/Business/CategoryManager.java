package Business;

import Entities.Category;
import dataAcces.ProductDao;

import java.util.List;

public class CategoryManager {
    ProductDao productDao;
    List<Category> categories;
    Boolean isEqual = true;

    public CategoryManager(ProductDao productDao, List<Category> categories) {
        this.productDao = productDao;
        this.categories = categories;
    }

    public void addCategory(Category category){
        for (Category category1: categories){
            if (category1.getName().equals(category.getName())){
                isEqual= false;
                break;
            }
        }

        if (isEqual){
            productDao.add(category);
            categories.add(category);
        }
        else{
            System.out.println("Category names should not be same!!!");
            isEqual=true;
        }

    }
}
