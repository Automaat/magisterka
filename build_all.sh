pushd $TRAVIS_BUILD_DIR/cpu-benchmark
./build_and_push_image.sh
popd

pushd $TRAVIS_BUILD_DIR/io-benchmark
./build_and_push_image.sh
popd

pushd $TRAVIS_BUILD_DIR/load-tests
./build_and_push_image.sh
popd