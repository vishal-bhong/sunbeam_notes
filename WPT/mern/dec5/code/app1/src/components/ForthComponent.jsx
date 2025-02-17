import Person from './Person'

function ForthComponent() {
  const persons = [
    { name: 'elon musk', company: 'SpaceX', income: '$200b' },
    { name: 'bill gates', company: 'Microsoft', income: '$150b' },
    { name: 'sundar picchai', company: 'Google', income: '$600m' },
    { name: 'satya nandela', company: 'MS', income: '$800m' },
    { name: 'Mukesh Ambai', company: 'Reliance', income: '$100b' },
  ]

  return (
    <div style={{ backgroundColor: 'red' }}>
      <h1>Persons</h1>
      {persons.map((person) => {
        return (
          <Person
            company={person.company}
            name={person.name}
            income={person.income}
          />
        )
      })}
    </div>
  )
}

export default ForthComponent
