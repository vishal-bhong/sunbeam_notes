const mysql = require('mysql2')

// create and open a connection
const connection = mysql.createConnection({
  host: 'localhost',
  port: 3306,
  user: 'root',
  password: 'root',
  database: 'Todo_db',
})

module.exports = {
  connection,
}
