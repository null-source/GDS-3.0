package application.model;

public class Employee {
	
	private String name;
	private int id;
	private int type;
	
	public Employee(String name, int id, int type) {
		super();
		this.setName(name);
		this.setId(id);
		this.setType(type);
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
}
