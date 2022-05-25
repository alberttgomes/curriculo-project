import React from "react";

import { Text, View, SafeAreaView, StyleSheet } from "react-native";
import { Avatar } from "react-native-paper";

const picture = require("../assets/me.jpeg");

const data = [
   {
    nome:"Albert Gomes Cabral",
    avatar:picture
   }
]

const HomeScreen = () => {

    return(
        <SafeAreaView style={styles.container}>
            <Avatar.Image 
                source={data.avatar}
                resizeMode={"cover"}
                style={styles.avatar}
            />
            <View>
                <Text>
                    {data.nome}
                </Text>
            </View>
        </SafeAreaView>
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