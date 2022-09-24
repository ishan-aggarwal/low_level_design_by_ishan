# How to manage the prototype functionality when we do have child classes.
-- We are making use of copy constructor from clone method because there is no way we can access the properties of Student class in IntelligentStudent class (as the attributes are private and the getter methods are also not provided)

-- So, we are calling the copy constructor functionality from the clone method of corresponding classes. When triggered from the child class

-- it will first make a call to the constructor of super class and will help in setting up the desired attributes.

-- Also, the need for clone method is because we want to achieve the dynamic binding (run-time polymorphism). If we would only make use of copy constructor to achieve the entire functionality, then we will have to depend on concrete classes only.