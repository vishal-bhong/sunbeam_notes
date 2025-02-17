function Car({ model, company, price }) {
  return (
    <div className='item'>
      <div>price = {price}</div>
      <div>model = {model}</div>
      <div>company = {company}</div>
    </div>
  )
}

// function Car(props) {
//   const { model, company, price } = props
//   return (
//     <div className='item'>
//       <div>price = {price}</div>
//       <div>model = {model}</div>
//       <div>company = {company}</div>
//     </div>
//   )
// }

// function Car(props) {
//     console.log(`props = `, props)
//     return (
//       <div className='item'>
//         <div>price = {props.price}</div>
//         <div>model = {props['model']}</div>
//         <div>company = {props.company}</div>
//       </div>
//     )
//   }

export default Car
