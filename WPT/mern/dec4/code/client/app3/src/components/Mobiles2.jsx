function Mobiles2() {
  const mobiles = [
    { model: 'iPhone 16 Pro Max', company: 'Apple', price: 200600 },
    { model: 'S24', company: 'Samsung', price: 98000 },
    { model: 'iPhone 16 Pro Max', company: 'Apple', price: 200600 },
    { model: 'S24', company: 'Samsung', price: 98000 },
    { model: 'iPhone 16 Pro Max', company: 'Apple', price: 200600 },
    { model: 'S24', company: 'Samsung', price: 98000 },
    { model: 'iPhone 16 Pro Max', company: 'Apple', price: 200600 },
    { model: 'S24', company: 'Samsung', price: 98000 },
    { model: 'iPhone 16 Pro Max', company: 'Apple', price: 200600 },
    { model: 'S24', company: 'Samsung', price: 98000 },
  ]

  return (
    <div className='container'>
      <h3>Mobiles</h3>
      <table className='table table-striped'>
        <thead>
          <tr>
            <th>No</th>
            <th>Model</th>
            <th>Company</th>
            <th>Price</th>
          </tr>
        </thead>

        <tbody>
          {mobiles.map((mobile, index) => {
            return (
              <tr>
                <td>{index}</td>
                <td>{mobile['model']}</td>
                <td>{mobile['company']}</td>
                <td>{mobile['price']}</td>
              </tr>
            )
          })}
        </tbody>
      </table>
    </div>
  )
}

export default Mobiles2
