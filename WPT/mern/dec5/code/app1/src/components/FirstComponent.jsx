import Car from './Car'

function FirstComponent() {
  const number = 100
  const person = {
    firstName: 'Steve',
    lastName: 'Jobs',
    company: 'Apple',
  }
  const cars = [
    { model: 'triber', company: 'Renault', price: 10 },
    { model: 'nano', company: 'Tata', price: 2.5 },
    { model: 'X5', company: 'BMW', price: 45 },
  ]
  return (
    <div>
      <h1>First Component</h1>
      <h5>Rendering a variable</h5>
      <div>Number = {number}</div>
      <hr />

      <h5>Rendering an object</h5>
      <div>First name = {person.firstName}</div>
      <div>Last name = {person['lastName']}</div>
      <div>Company = {person.company}</div>
      <hr />

      <h5>Rendering an array</h5>
      {cars.map((car) => {
        return (
          <Car
            model={car['model']}
            company={car['company']}
            price={car['price']}
          />
        )
      })}
    </div>
  )
}

export default FirstComponent
