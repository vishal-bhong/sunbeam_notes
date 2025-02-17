function SecondComponent() {
  const todoItems = [
    {
      userId: 1,
      id: 1,
      title: 'delectus aut autem',
      completed: false,
    },
    {
      userId: 1,
      id: 2,
      title: 'quis ut nam facilis et officia qui',
      completed: false,
    },
  ]

  return (
    <div>
      <table className='table' border='1'>
        <thead>
          <tr>
            <th>Id</th>
            <th>User Id</th>
            <th>Title</th>
            <th>Completed</th>
          </tr>
        </thead>
        <tbody>
          {todoItems.map((item) => {
            return (
              <tr>
                <td>{item['id']}</td>
                <td>{item['userId']}</td>
                <td>{item['title']}</td>
                <td>{item['completed']}</td>
              </tr>
            )
          })}
        </tbody>
      </table>
    </div>
  )
}

export default SecondComponent
