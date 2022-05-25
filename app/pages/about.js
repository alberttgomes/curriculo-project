import React from 'react';
import {View, ScrollView, Text, SafeAreaView} from 'react-native';

import Theme from '../components/theme';

const text = "technology lover, clean codes and an immense desire to learn.";

const AboutScreen = () => {

    return(
        <SafeAreaView theme={Theme.backgroundcolor}>
            <View>
                <Text>About me</Text>
            </View>
            <ScrollView>
                <Text
                  value={text}
                  onChange={({target}) => (target.value)}
                />
            </ScrollView>
        </SafeAreaView>
    );
}

export default AboutScreen;