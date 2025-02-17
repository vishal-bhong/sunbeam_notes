function Person({ name, income, company }) {
  return (
    <div className='item'>
      <div>Name: {name}</div>
      <div>Income: {income}</div>
      <div>Company: {company}</div>
    </div>
  )
}

export default Person
