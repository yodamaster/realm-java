/* This file was automatically generated by TightDB. */

package com.tightdb.generated;


import com.tightdb.*;
import com.tightdb.lib.*;

/**
 * This class represents a TightDB cursor and was automatically generated.
 */
public class Employee extends AbstractCursor<Employee> {

    public final StringCursorColumn<Employee, EmployeeQuery> firstName;
    public final StringCursorColumn<Employee, EmployeeQuery> lastName;
    public final LongCursorColumn<Employee, EmployeeQuery> salary;
    public final BooleanCursorColumn<Employee, EmployeeQuery> driver;
    public final BinaryCursorColumn<Employee, EmployeeQuery> photo;
    public final DateCursorColumn<Employee, EmployeeQuery> birthdate;
    public final MixedCursorColumn<Employee, EmployeeQuery> extra;
    public final TableCursorColumn<Employee, EmployeeQuery, PhoneTable> phones;

	public Employee(TableBase table, long position) {
		super(table, Employee.class, position);

        firstName = new StringCursorColumn<Employee, EmployeeQuery>(EmployeeTable.TYPES, table, this, 0, "firstName");
        lastName = new StringCursorColumn<Employee, EmployeeQuery>(EmployeeTable.TYPES, table, this, 1, "lastName");
        salary = new LongCursorColumn<Employee, EmployeeQuery>(EmployeeTable.TYPES, table, this, 2, "salary");
        driver = new BooleanCursorColumn<Employee, EmployeeQuery>(EmployeeTable.TYPES, table, this, 3, "driver");
        photo = new BinaryCursorColumn<Employee, EmployeeQuery>(EmployeeTable.TYPES, table, this, 4, "photo");
        birthdate = new DateCursorColumn<Employee, EmployeeQuery>(EmployeeTable.TYPES, table, this, 5, "birthdate");
        extra = new MixedCursorColumn<Employee, EmployeeQuery>(EmployeeTable.TYPES, table, this, 6, "extra");
        phones = new TableCursorColumn<Employee, EmployeeQuery, PhoneTable>(EmployeeTable.TYPES, table, this, 7, "phones", PhoneTable.class);
	}

	public java.lang.String getFirstName() {
		return this.firstName.get();
	}

	public void setFirstName(java.lang.String firstName) {
		this.firstName.set(firstName);
	}

	public java.lang.String getLastName() {
		return this.lastName.get();
	}

	public void setLastName(java.lang.String lastName) {
		this.lastName.set(lastName);
	}

	public long getSalary() {
		return this.salary.get();
	}

	public void setSalary(long salary) {
		this.salary.set(salary);
	}

	public boolean getDriver() {
		return this.driver.get();
	}

	public void setDriver(boolean driver) {
		this.driver.set(driver);
	}

	public byte[] getPhoto() {
		return this.photo.get();
	}

	public void setPhoto(byte[] photo) {
		this.photo.set(photo);
	}

	public java.util.Date getBirthdate() {
		return this.birthdate.get();
	}

	public void setBirthdate(java.util.Date birthdate) {
		this.birthdate.set(birthdate);
	}

	public java.io.Serializable getExtra() {
		return this.extra.get();
	}

	public void setExtra(java.io.Serializable extra) {
		this.extra.set(extra);
	}

	public PhoneTable getPhones() {
		return this.phones.get();
	}

	public void setPhones(PhoneTable phones) {
		this.phones.set(phones);
	}

	@Override
	public AbstractColumn<?, ?, ?>[] columns() {
		return getColumnsArray(firstName, lastName, salary, driver, photo, birthdate, extra, phones);
	}

}