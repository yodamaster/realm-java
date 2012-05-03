/* This file was automatically generated by TightDB. */

package com.tightdb.generated;

import java.util.Date;

import com.tightdb.*;
import com.tightdb.lib.*;

/**
 * This class represents a TightDB table and was automatically generated.
 */
public class EmployeeTable extends AbstractTable<Employee, EmployeeView, EmployeeQuery> {

	public static final EntityTypes<EmployeeTable, EmployeeView, Employee, EmployeeQuery> TYPES = new EntityTypes<EmployeeTable, EmployeeView, Employee, EmployeeQuery>(EmployeeTable.class, EmployeeView.class, Employee.class, EmployeeQuery.class); 

	public final StringRowsetColumn<Employee, EmployeeQuery> firstName = new StringRowsetColumn<Employee, EmployeeQuery>(TYPES, table, 0, "firstName");
	public final StringRowsetColumn<Employee, EmployeeQuery> lastName = new StringRowsetColumn<Employee, EmployeeQuery>(TYPES, table, 1, "lastName");
	public final LongRowsetColumn<Employee, EmployeeQuery> salary = new LongRowsetColumn<Employee, EmployeeQuery>(TYPES, table, 2, "salary");
	public final BooleanRowsetColumn<Employee, EmployeeQuery> driver = new BooleanRowsetColumn<Employee, EmployeeQuery>(TYPES, table, 3, "driver");
	public final BinaryRowsetColumn<Employee, EmployeeQuery> photo = new BinaryRowsetColumn<Employee, EmployeeQuery>(TYPES, table, 4, "photo");
	public final DateRowsetColumn<Employee, EmployeeQuery> birthdate = new DateRowsetColumn<Employee, EmployeeQuery>(TYPES, table, 5, "birthdate");
	public final MixedRowsetColumn<Employee, EmployeeQuery> extra = new MixedRowsetColumn<Employee, EmployeeQuery>(TYPES, table, 6, "extra");
	public final TableRowsetColumn<Employee, EmployeeQuery, PhoneTable> phones = new TableRowsetColumn<Employee, EmployeeQuery, PhoneTable>(TYPES, table, 7, "phones", PhoneTable.class);

	public EmployeeTable() {
		super(Employee.class, EmployeeView.class, EmployeeQuery.class);
	}

	@Override
	protected void specifyStructure(TableSpec spec) {
        registerStringColumn(spec, "firstName");
        registerStringColumn(spec, "lastName");
        registerLongColumn(spec, "salary");
        registerBooleanColumn(spec, "driver");
        registerBinaryColumn(spec, "photo");
        registerDateColumn(spec, "birthdate");
        registerMixedColumn(spec, "extra");
        registerTableColumn(spec, "phones", new PhoneTable());
    }

    public Employee add(String firstName, String lastName, int salary, boolean driver, byte[] photo, Date birthdate, Object extra) {
        try {
        	int position = size();

        	insertString(0, position, firstName);
        	insertString(1, position, lastName);
        	insertLong(2, position, salary);
        	insertBoolean(3, position, driver);
        	insertBinary(4, position, photo);
        	insertDate(5, position, birthdate);
        	insertMixed(6, position, extra);
        	insertTable(7, position);
        	insertDone();

        	return cursor(position);
        } catch (Exception e) {
        	throw addRowException(e);
        }

    }

    public Employee insert(long position, String firstName, String lastName, int salary, boolean driver, byte[] photo, Date birthdate, Object extra) {
        try {
        	insertString(0, position, firstName);
        	insertString(1, position, lastName);
        	insertLong(2, position, salary);
        	insertBoolean(3, position, driver);
        	insertBinary(4, position, photo);
        	insertDate(5, position, birthdate);
        	insertMixed(6, position, extra);
        	insertTable(7, position);
        	insertDone();

        	return cursor(position);
        } catch (Exception e) {
        	throw insertRowException(e);
        }


    }


}
