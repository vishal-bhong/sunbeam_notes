function Person() {
  const firstName = 'Elon'
  const lastName = 'Musk'
  const company = 'SpaceX'
  return (
    <div>
      <h3>Person</h3>
      <div>First Name: {firstName}</div>
      <div>Last Name: {lastName}</div>
      <div>Company: {company}</div>
    </div>
  )
}

export default Person
