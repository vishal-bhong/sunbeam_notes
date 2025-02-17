const mysql = require('mysql2')

// create connection pool
// - pool is a collection of mysql connections managed by MySQL
const pool = mysql.createPool({
  host: 'localhost',
  port: 3306,
  user: 'D3_87133_Vishal',
  password: 'manager',
  database: 'Todo_application_db',
})

// export the pool
module.exports = {
  pool,
}
