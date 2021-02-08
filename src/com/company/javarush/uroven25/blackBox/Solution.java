package com.company.javarush.uroven25.blackBox;

/*
Black box
*/

public class Solution implements Action {
    public static int countActionObjects;

    private int param;

    private Action solutionAction = new Action() {

        public void someAction() {
            if(param > 0) {
                for(int i = param; i > 0; i--) {
                    System.out.println(i);
                }
                FirstClass firstClass = new FirstClass() {
                    @Override
                    public Action getDependantAction() {
                        return null;
                    }

                    @Override
                    public void someAction() {
                        super.someAction();
                    }
                };
                firstClass.someAction();
                SecondClass secondClass = new SecondClass();
                secondClass.sb.append(SecondClass.SPECIFIC_ACTION_FOR_ANONYMOUS_SECOND_CLASS_PARAM + 0);
                secondClass.someAction();
            }
            else {
                SecondClass secondClass = new SecondClass();
                secondClass.sb.append(SecondClass.SPECIFIC_ACTION_FOR_ANONYMOUS_SECOND_CLASS_PARAM + param);
                secondClass.someAction();
            }
        }
    };


    public Solution(int param) {
        this.param = param;
    }

    @Override
    public void someAction() {
        solutionAction.someAction();
    }

    /**
     * 5
     * 4
     * 3
     * 2
     * 1
     * class FirstClass, method someAction
     * class SecondClass, method someAction
     * Specific action for anonymous SecondClass, param = 0
     * Count of created Action objects is 2
     * class SecondClass, method someAction
     * Specific action for anonymous SecondClass, param = -1
     * Count of created Action objects is 3
     */
    public static void main(String[] args) {
        Solution solution = new Solution(5);
        solution.someAction();
        System.out.println("Count of created Action objects is " + countActionObjects);

        solution = new Solution(-1);
        solution.someAction();
        System.out.println("Count of created Action objects is " + countActionObjects);
    }
}