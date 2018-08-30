//Kotlin tutorial 1
fun toJSON(collection: Collection<Int>): String{
	val sb = StringBulider()
	sb.append("[")
	val iterator = collection.iterator()
	while(iterator.hasNext())
	{
		val element = iterator.next()
		sb.append(element)
		if(iterator.hasNext())
		{
			sb.append(", ")
		}
	}
	sb.append("]")
	return sb.toString()
}