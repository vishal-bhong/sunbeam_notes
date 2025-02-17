import './Mobiles1.css'

function Mobiles1() {
  const mobiles = [
    { model: 'iPhone 16 Pro Max', company: 'Apple', price: 200600 },
    { model: 'S24', company: 'Samsung', price: 98000 },
  ]

  return (
    <div>
      <h3>Mobiles1</h3>
      {mobiles.map((mobile) => {
        return (
          <div className='mobile'>
            <div>model: {mobile['model']}</div>
            <div>company: {mobile.company}</div>
            <div>price: {mobile['price']}</div>
          </div>
        )
      })}

      {/* <div>
        <div>model: {mobiles[0]['model']}</div>
        <div>company: {mobiles[0].company}</div>
        <div>price: {mobiles[0]['price']}</div>
      </div> */}
    </div>
  )
}

export default Mobiles1
