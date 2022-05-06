package HW1part2;
//in this class we have group name and group size 
// we have getters and setters because they are declared as private 
// and to string method for the wanted printing style
public class Group {

	private String GroupName;
	private int GroupSize;
// In the constructor  we set groupname and group size as a parameter
	public Group(String GroupName, int GroupSize) {
		this.GroupName = GroupName;
		this.GroupSize = GroupSize;
	}

	public String getGroupName() {
		return GroupName;
	}

	public void setGroupName(String groupName) {
		GroupName = groupName;
	}

	public int getGroupSize() {
		return GroupSize;
	}

	public void setGroupSize(int groupSize) {
		GroupSize = groupSize;
	}

	@Override
	public String toString() {
		return GroupName + " " + GroupSize ;
	}

}
