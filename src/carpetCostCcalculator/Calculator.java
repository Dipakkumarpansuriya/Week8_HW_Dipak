package carpetCostCcalculator;
/*Write the following methods (instance methods):
● Method named getCost without any parameters, it needs to return the value of cost field
3. Write a class with the name Calculator. The class needs two fields (instance variables) with name
floor of type Floor and carpet of type Carpet.
The class needs to have one constructor with parameters floor of type Floor and carpet of type Carpet
and it needs to initialize the fields.
Write the following methods (instance methods):*/
public class Calculator {

            Floor floor;
        Carpet carpet;

        public Calculator(Floor floor, Carpet carpet) {
            this.floor = floor;
            this.carpet = carpet;
        }

        public double getTotalCost() {
            return (floor.getArea() * carpet.getCost());
        }


    }

