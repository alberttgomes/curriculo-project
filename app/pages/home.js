import React from "react";

import { Text, View, StyleSheet } from "react-native";
import { Avatar } from "react-native-paper";

//const picture = require("");

const data = {
    nome:"Albert Gomes Cabral",
    avatar:picture
}

const HomeScreen = ({ navigation }) => {

    return(
        <View style={styles.container}>
            <Avatar.Image 
                source={require(data.avatar)}
                resizeMode={"cover"}
                style={styles.avatar}
            />
            <Text>
                {data.nome}
            </Text>
        </View>
    )

}

const styles = StyleSheet.create({
    avatar:{
        width: 90,
        height: 90,
        borderRadius: 30 
    },
    container:{
        flex:1,
    },
    nome:{
        fontSize: 23,
        fontWeight:"bold",
        alignSelf:"center"
    }
})

export default HomeScreen;