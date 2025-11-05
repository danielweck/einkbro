package info.plateaukao.einkbro_.browser

interface DomainInterface {
    fun getDomains(): List<String>
    fun addDomain(domain: String)
    fun deleteDomain(domain: String)
    fun deleteAllDomains()
}