from zeep import Client

client = Client('http://127.0.0.1:9876/Valida?wsdl')

result = client.service.valida("587545-85")
result2 = client.service.valida("5487545-85")
result3 = client.service.valida("54875-85")
print (result, result2, result3)
