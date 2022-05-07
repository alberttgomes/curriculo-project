import React, {useState, useEffect} from "react";

import { Text, View, ScrollView } from "react-native";

const Information = () => {
    const [getInformation, setGetInformation] = useState([]);
    
    useEffect(() => {}, []);

    return (
        <View>
            <Text>
                Informações
            </Text>
            <ScrollView>
                {getInformation.map(getInformation => (
                    <View key={getInformation.id}>
                        <Text>Email: {getInformation.email}</Text>
                        <Text>Contato: {getInformation.contate}</Text>
                        <Text>Rede Social: {getInformation.socialMedia}</Text>
                        <Text>Endereço: {getInformation.address}</Text>
                    </View>
                ))}
            </ScrollView>
        </View>
    );
}

export default Information;