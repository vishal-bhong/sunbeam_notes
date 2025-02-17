function Car() {
  const car = {
    model: 'triber',
    company: 'renault',
    price: '10L',
  }
  return (
    <div>
      <h3>Car</h3>
      <div>Model: {car.model}</div>
      <div>Company: {car['company']}</div>
      <div>Price: {car.price}</div>
    </div>
  )
}

export default Car
