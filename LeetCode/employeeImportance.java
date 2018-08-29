//https://leetcode.com/problems/employee-importance/description/

/*
// Employee info
class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
};
*/
class Solution {
    public int getImportance(List<Employee> employees, int id) {
    	Employee getImp = getEmployee(employees, id);
    	
    	Queue<Employee> qu = new LinkedList<>();
    	qu.offer(getImp);
    	int totalVal = 0;
    	while(!qu.isEmpty())
    	{
    		Employee curr = qu.poll();
    		totalVal+=curr.importance;
    		for(int i: curr.subordinates){
    			qu.offer(getEmployee(employees, i));
    		}
    	}
    	return totalVal;
    }

    public Employee getEmployee(List<Employee> emps, int id){
    	for(Employee e: emps){
    		if(e.id == id)
    			{
    				return e;
    			}
    	}
    	return null;
    }
}