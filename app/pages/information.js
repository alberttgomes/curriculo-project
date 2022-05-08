import React, {useState, useEffect} from "react";

import { Text, View, ScrollView, StyleSheet } from "react-native";

import { InformationGet } from "./request";

const Information = () => {
    
    const [getInformation, setGetInformation] = useState([]);
    
    useEffect(() => {
        InformationGet().then(res => {
            setGetInformation(res.items);
        })
    }, []);

    return (
        <View style={styles.container}>
            <Text style={styles.text}>
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

const styles = StyleSheet.create({
    container: {
        flex:1,
    },
    text: {
        fontSize: 25,
        fontWeight: 'bold'
    }
})

export default Information;