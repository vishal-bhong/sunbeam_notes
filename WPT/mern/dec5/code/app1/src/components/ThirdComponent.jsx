import Car from './Car'
import './styles.css'

function ThirdComponent() {
  const cars = [
    { model: 'i20', company: 'hyundai', price: 12 },
    { model: 'Xuv', company: 'mahindra', price: 15 },
    { model: 'GLS 350d', company: 'mercedez', price: 120 },
  ]

  return (
    <div>
      <h1>Third Component</h1>
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

export default ThirdComponent
