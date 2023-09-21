let connection;
var oracledb = require('oracledb');

oracledb.getConnection(
	{
		user: 'HR',
		password: 'HR',
		connectString: 'localhost/XE'
	},
	function (err, connection) {
		if (err) {
			console.error("db has connected failed: " + err.message);
			return;
		}

		console.log("connected ");

		//read one
        fectchAll(connection)
        insertIntoDB(connection)
        UpadateRecordInDB(connection)
        DeleteRecordInDB(connection)
		//doRelease(connection);
	});
function fectchAll(connection) {
	var sql = "select * from DEPARTMENTS";
	var params = [];
	connection.execute(sql, params, function (err, result) {
		if (err) {
			console.error("query failed: " + err.message);
			console.error(err);
			return;
		}

		//console.log(result);
		console.log(result.rows);
	});
}
function insertIntoDB(connection) {
	var sql = "INSERT INTO Department  VALUES (?,?,?.?,?)";
	var params = [DepartemntId, DepartmentName, ManagerName,ManagerId];
	connection.execute(sql, params, function (err, result) {
		if (err) {
			console.error("query failed: " + err.message);
			console.error(err);
			return;
		}

		//console.log(result);
		console.log(result.rows);
	});
}
function UpadateRecordInDB(connection) {
	var sql = "UPDATE departments set[?,?,?,]  where managerId= ?";
	var params = [DepartemntId, DepartmentName, ManagerName,ManagerId];
	connection.execute(sql, params, function (err, result) {
		if (err) {
			console.error("query failed: " + err.message);
			console.error(err);
			return;
		}

		//console.log(result);
		console.log(result.rows);
	});
}

function DeleteRecordInDB(connection) {
	var sql = "DELETE FROM departments WHERE departmentId = ?";
	var params = [DepartmentId];
	connection.execute(sql, params, function (err, result) {
		if (err) {
			console.error("query failed: " + err.message);
			console.error(err);
			return;
		}

		//console.log(result);
		console.log(result.rows);
	});
}